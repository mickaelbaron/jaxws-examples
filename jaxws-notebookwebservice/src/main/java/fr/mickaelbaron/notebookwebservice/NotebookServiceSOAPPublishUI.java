package fr.mickaelbaron.notebookwebservice;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import jakarta.xml.ws.Endpoint;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 */
public class NotebookServiceSOAPPublishUI extends JFrame {

	private static final long serialVersionUID = -6669232499977314741L;

	private Endpoint publish;

	public NotebookServiceSOAPPublishUI() {
		this.getContentPane().setLayout(new GridLayout(2, 1));
		final JButton startPublish = new JButton();
		this.getContentPane().add(startPublish);
		startPublish.setText("Start Publish");

		final JButton stopPublish = new JButton();
		stopPublish.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				publish.stop();
				stopPublish.setEnabled(false);
				startPublish.setEnabled(true);
			}
		});
		stopPublish.setText("Stop Publish");

		startPublish.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				NotebookService current = new NotebookServiceImpl();
				publish = Endpoint.publish("http://localhost:8080/notebookwebservice/notebook", current);
				startPublish.setEnabled(false);
				stopPublish.setEnabled(true);
			}
		});
		stopPublish.setEnabled(false);
		startPublish.setEnabled(true);

		this.getContentPane().add(stopPublish);

		this.setTitle("Start / Stop Web Service Publication");
		this.setMinimumSize(new Dimension(400, 200));
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new NotebookServiceSOAPPublishUI();
	}
}
