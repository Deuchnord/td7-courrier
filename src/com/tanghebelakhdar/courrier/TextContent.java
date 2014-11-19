package com.tanghebelakhdar.courrier;

public class TextContent implements Content {
	
	private String content;
	
	/**
	 * Constructor
	 * @param text the content of the text.
	 */
	public TextContent(String text) {
		content = text;
	}

	public String getText()
	{
		return this.content;
	}
	

}
