package com.Automation1;

import java.io.IOException;

public class FileReaderManager {
	private FileReaderManager()
	{
	}
	public static FileReaderManager getInstanceFRM() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	public ConfigurationReader getInstanceCR() throws IOException
	{
		ConfigurationReader cr= new ConfigurationReader();
		return cr;
	}
	}
	
