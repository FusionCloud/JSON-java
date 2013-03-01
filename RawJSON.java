/*
 * 
 */
package org.json;
/**
 * The Class RawJSON.
 * @author marcuslongmuir
 * @version $Revision: 1.0 $
 */
public class RawJSON {

	/** The raw json. */
	String rawJSON = null;
	public Object data = null;

	/**
	 * Instantiates a new raw json.
	 *
	 * @param string the string
	 */
	public RawJSON(String string){
		this.rawJSON = string;
	}

	/**
	 * Constructor for RawJSON.
	 * @param string1 String
	 * @param object Object
	 */
	public RawJSON(String string1, Object object){
		this.rawJSON = string1;
		this.data = object;
	}

	/**
	 * Sets the string.
	 *
	 * @param toSet the new string
	 */
	public void setString(String toSet){
		this.rawJSON = toSet;
	}

	/**
	 * Clone other raw json.
	 *
	 * @param other the other
	 */
	public void cloneOtherRawJSON(RawJSON other){
		this.rawJSON = other.rawJSON;
	}

	/**
	 * Clone json object.
	 *
	 * @param obj the obj
	 */
	public void cloneJSONObject(JSONObject obj){
		this.rawJSON = obj.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return this.rawJSON;
	}
}