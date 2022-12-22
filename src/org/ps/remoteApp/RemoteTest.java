package org.ps.remoteApp;

import java.util.Scanner;

public class RemoteTest 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the type of remote");
	String type=sc.nextLine();
	ISwitch remote=RemoteFactory.getremote(type);
	if(remote!=null)
	{
	remote.sOn();
	remote.sOff();
	}
}

}
