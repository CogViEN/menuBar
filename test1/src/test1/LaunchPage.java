package test1;

import java.awt.Desktop;
import java.net.URI;

public class LaunchPage 
{
	public void launchFacebook()
	{
		try {
		Desktop.getDesktop().browse(URI.create("www.facebook.com"));
		}
		catch(Exception e) {}
	}
	
	public void launchYoutube()
	{
		try {
			Desktop.getDesktop().browse(URI.create("www.youtube.com"));
			}
			catch(Exception e) {}
	}
	
	public void launchInstagram()
	{
		try {
			Desktop.getDesktop().browse(URI.create("www.instagram.com"));
			}
			catch(Exception e) {}
	}
	
	public void launchGitHub()
	{
		try {
			Desktop.getDesktop().browse(URI.create("https://github.com"));
			}
			catch(Exception e) {}
	}
}
