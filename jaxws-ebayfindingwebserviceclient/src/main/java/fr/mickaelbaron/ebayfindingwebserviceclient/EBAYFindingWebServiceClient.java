package fr.mickaelbaron.ebayfindingwebserviceclient;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 */
public class EBAYFindingWebServiceClient {

	private static final String APPID = "TO_COMPLETE";

	private static final String CALLNAME = "findItemsAdvanced";

	private static final String BASEURL = "http://svcs.ebay.com/services/search/FindingService/v1";
	
	private static final String CATEGORY_ID = "267"; // books, comics and journals. For all categories, replace by 0.
	
	private static final String KEYWORDS = "Game of thrones";
	
	public static void main(String[] args) {
		// Initialization		
		FindingService service = new FindingService();
		FindingServicePortType port = service.getFindingServiceSOAPPort();

		BindingProvider bp = (BindingProvider) port;
		Map<String, Object> requestProperties = bp.getRequestContext();
		Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
		// Set the headers
		httpHeaders.put("X-EBAY-SOA-OPERATION-NAME", Collections.singletonList(CALLNAME));
		httpHeaders.put("X-EBAY-SOA-SECURITY-APPNAME", Collections.singletonList(APPID));
		requestProperties.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);
		requestProperties.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, BASEURL);

		// Prepare query.
		FindItemsAdvancedRequest req = new FindItemsAdvancedRequest();
		List<OutputSelectorType> opSelector = req.getOutputSelector();
		opSelector.add(OutputSelectorType.SELLER_INFO);

		ItemFilter objFilter1 = new ItemFilter();
		objFilter1.setName(ItemFilterType.AVAILABLE_TO);
		objFilter1.getValue().add("FR");

		ItemFilter objFilter2 = new ItemFilter();
		objFilter2.setName(ItemFilterType.LISTING_TYPE);
		objFilter2.getValue().add("All");

		ItemFilter objFilter3 = new ItemFilter();
		objFilter3.setName(ItemFilterType.HIDE_DUPLICATE_ITEMS);
		objFilter3.getValue().add("false");

		List<ItemFilter> itemFilter = req.getItemFilter();
		itemFilter.add(objFilter1);
		itemFilter.add(objFilter2);
		itemFilter.add(objFilter3);

		List<String> catID = req.getCategoryId();
		catID.add(CATEGORY_ID);

		req.setSortOrder(SortOrderType.END_TIME_SOONEST);
		req.setKeywords(KEYWORDS);

		FindItemsAdvancedResponse res = port.findItemsAdvanced(req);

		// Extract result.
		SearchResult searchResult = res.getSearchResult();
		List<SearchItem> item = searchResult.getItem();
		for (SearchItem searchItem : item) {
			System.out.println(searchItem.getTitle() + " (" + searchItem.getGalleryURL() + ")");
		}
		System.out.println("Search Count: " + searchResult.getCount());
	}
}
