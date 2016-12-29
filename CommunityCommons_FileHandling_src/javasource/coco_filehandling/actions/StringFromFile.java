// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package coco_filehandling.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

import coco_filehandling.FileHandling;

/**
 * Reads the contents form the provided file document and return it as string
 * 
 * Note that this might give strange results when using with binary files. In that case, use the Base64 functions.
 */
public class StringFromFile extends CustomJavaAction<String>
{
	private IMendixObject __source;
	private system.proxies.FileDocument source;

	public StringFromFile(IContext context, IMendixObject source)
	{
		super(context);
		this.__source = source;
	}

	@Override
	public String executeAction() throws Exception
	{
		this.source = __source == null ? null : system.proxies.FileDocument.initialize(getContext(), __source);

		// BEGIN USER CODE
		return FileHandling.stringFromFile(getContext(), source);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "StringFromFile";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}