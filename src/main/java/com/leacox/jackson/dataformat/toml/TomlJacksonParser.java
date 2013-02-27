package com.leacox.jackson.dataformat.toml;

import java.io.IOException;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.IOContext;

public class TomlJacksonParser extends ParserBase {

	protected TomlJacksonParser(IOContext ctxt, int features) {
		super(ctxt, features);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void _closeInput() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	protected void _finishString() throws IOException, JsonParseException {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean loadMore() throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public byte[] getBinaryValue(Base64Variant arg0) throws IOException, JsonParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText() throws IOException, JsonParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] getTextCharacters() throws IOException, JsonParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTextLength() throws IOException, JsonParseException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTextOffset() throws IOException, JsonParseException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public JsonToken nextToken() throws IOException, JsonParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObjectCodec getCodec() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getEmbeddedObject() throws IOException, JsonParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCodec(ObjectCodec arg0) {
		// TODO Auto-generated method stub

	}

}
