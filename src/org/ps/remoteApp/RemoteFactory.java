package org.ps.remoteApp;

public class RemoteFactory {
	public static ISwitch getremote(String type)
	{
		if(type.equalsIgnoreCase("Lg"))
		{
			return new LgRemoteimpl();
		}
		else if(type.equalsIgnoreCase("Samsung"))
		{
			return new SamsungRemoteimpl();
		}
		else
		{
			System.out.println("no such remote found");
			return null;
		}
	}


}
