package com.scadroid.webservice.request;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.5
//
// Date Of Creation: 7/22/2014 2:10:02 AM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//
import java.util.ArrayList;
import java.util.Hashtable;

import org.ksoap2.serialization.AttributeContainer;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class ReadDataResponse implements KvmSerializable {
    
    public ArrayList<APIError> errors;
    public ArrayList<ItemStringValue> itemsList;
    public ReplyBase replyBase;
    
    public ReadDataResponse(){}
    
    public ReadDataResponse (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {

    	if (inObj == null)
            return;

	    SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("errors"))
        {	
	        int size = soapObject.getPropertyCount();
	        this.errors = new ArrayList<APIError>();
	        for (int i0=0;i0< size;i0++)
	        {
	            PropertyInfo info=new PropertyInfo();
	            soapObject.getPropertyInfo(i0, info);
                Object obj = info.getValue();
	            if (obj!=null && info.name.equals("errors"))
	            {
                    Object j =info.getValue();
	                APIError j1= (APIError)envelope.get(j,APIError.class);
	                this.errors.add(j1);
	            }
	        }
        }
        
        if (soapObject.hasProperty("itemsList"))
        {	
	        int size = soapObject.getPropertyCount();
	        this.itemsList = new ArrayList<ItemStringValue>();
	        for (int i0=0;i0< size;i0++)
	        {
	            PropertyInfo info=new PropertyInfo();
	            soapObject.getPropertyInfo(i0, info);
                Object obj = info.getValue();
	            if (obj!=null && info.name.equals("itemsList"))
	            {
                    Object j =info.getValue();
                    ItemStringValue j1= (ItemStringValue)envelope.get(j,ItemStringValue.class);
	                this.itemsList.add(j1);
	            }
	        }
        }
        
        if (soapObject.hasProperty("replyBase"))
        {	
	        Object j = soapObject.getProperty("replyBase");
	        this.replyBase = (ReplyBase)envelope.get(j,ReplyBase.class);
        }


    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return errors;
            case 1:
                return itemsList;
            case 2:
                return replyBase;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 3;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "errors";
                break;
            case 1:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "itemsList";
                break;
            case 2:
                info.type = ReplyBase.class;
                info.name = "replyBase";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }

	@Override
	public String getInnerText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInnerText(String arg0) {
		// TODO Auto-generated method stub

	}

}