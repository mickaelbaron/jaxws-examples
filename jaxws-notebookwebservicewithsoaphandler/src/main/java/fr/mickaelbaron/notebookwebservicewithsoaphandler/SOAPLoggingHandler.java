package fr.mickaelbaron.notebookwebservicewithsoaphandler;

import java.io.PrintStream;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 */
public class SOAPLoggingHandler implements SOAPHandler<SOAPMessageContext> {

	private static PrintStream out = System.out;

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

	@Override
	public void close(MessageContext context) {
	}

	public boolean handleMessage(SOAPMessageContext smc) {
		logToSystemOut(smc);
		return true;
	}

	public boolean handleFault(SOAPMessageContext smc) {
		logToSystemOut(smc);
		return true;
	}

	private void logToSystemOut(SOAPMessageContext smc) {
		Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		if (outboundProperty.booleanValue()) {
			out.println("\nOutgoing message from web service provider:");
		} else {
			out.println("\nIncoming message to web service provider:");
		}

		SOAPMessage message = smc.getMessage();
		try {
			message.writeTo(out);
			out.println("");
		} catch (Exception e) {
			out.println("Exception in handler: " + e);
		}
	}
}