package _07_tv_show_episode_info;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TVShowEpisodeInfoDisplayer implements ActionListener {
	
	JButton button = new JButton();
	JTextField field = new JTextField(10);
	
	public TVShowEpisodeInfoDisplayer() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("TV Show Info");
		button.setText("Submit");
		button.addActionListener(this);
		panel.add(field);
		panel.add(button);
		frame.add(panel);
		frame.pack();
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		String string = field.getText();
		if (buttonPressed == button) {
			String info = getShowEpisodeData(string);
			JOptionPane.showMessageDialog(null, info);
		}
	}
	
	

/////////////////////////DO NOT MODIFY ANY CODE BELOW THIS LINE//////////////////////////////////////////
	
	/**
	 * Searches the tvmaze.com api for season and episode information about
	 * a chosen show and returns the information in a String
	 * 
	 * @param showTitle	the name of the show to get information about
	 * @return 			a String containing the show information or a blank
	 * 					String if the show is not found
	 */
	public String getShowEpisodeData(String showTitle) {
		int id = WebUtilities.getShowId(showTitle);
		if(id < 0) {
			return "";
		}
		
		int totalSeasons = 0;
		int totalEpisodes = 0;
		int[] episodes = null;
		
		try {
			URL url = new URL("https://api.tvmaze.com/shows/"+id+"/seasons");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			InputStream responseStream = connection.getInputStream();
			String in = WebUtilities.getStringFromInputStream(responseStream);
			String[] info = WebUtilities.parseJSONArray(in);
			totalSeasons = info.length;
			episodes = new int[totalSeasons];
			boolean success = true;
			for(int i = 0; i < totalSeasons; i++) {
				try {
					episodes[i] = WebUtilities.getIntFromJSONObject(info[i], "episodeOrder");
				}catch(Exception e) {
					episodes[i] = -1;
					success = false;
				}
				totalEpisodes += episodes[i];
			}
			if(!success) {
				JOptionPane.showMessageDialog(null, "Could not retrieve some or all of the episode data.", "Data Not Available", 0);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String res = showTitle + "\nTotal Seasons: " + totalSeasons + "\nTotal Episodes: " + totalEpisodes + '\n';
		for(int i = 0; i < totalSeasons; i++) {
			res += "Season " + (i + 1) +": " + (episodes[i] > -1 ? episodes[i] : "?") + " episodes\n";
		}
		
		return res;
	}

}
