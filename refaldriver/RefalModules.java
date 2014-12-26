//
// Auto-generated using JActiveX.EXE 5.00.2918
//   ("C:\Program Files\Microsoft Visual Studio\VJ98\jactivex.exe" /wfc  /w /xi /X:rkc /l "C:\DOCUME~1\a\LOCALS~1\Temp\jvcB4.tmp" /nologo /d "C:\Projects\JRefalDriver\RDCOMInteropTest" "C:\Refal5\RefalDriver\RefalDriver.dll")
//
// WARNING: Do not remove the comments that include "@com" directives.
// This source file must be compiled by a @com-aware compiler.
// If you are using the Microsoft Visual J++ compiler, you must use
// version 1.02.3920 or later. Previous versions will not issue an error
// but will not generate COM-enabled class files.
//

package refaldriver;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;
import stdole2.*;

/** @com.class(classid=91CBD716-6EDA-47BD-B4D0-A259AF3FBD70,DynamicCasts) 
    @com.interface(iid=67CE9E64-2A56-4D73-956C-28676203D932, thread=AUTO, type=DUAL) */
public class RefalModules implements IUnknown,com.ms.com.NoAutoScripting,refaldriver._RefalModules
{
  /** @com.method(vtoffset=4, dispid=1610809346, type=METHOD, name="AddFromScript", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=STRING,type=ARRAY] ScriptSourceCode, [in,type=BOOLEAN] RegisterAssembly, [iid=655C7C21-14E0-466B-B5FA-1EC9749E18AF,thread=AUTO,type=DISPATCH] return) */
  public native refaldriver._RefalModule AddFromScript(String[] ScriptSourceCode, boolean RegisterAssembly);

  /** @com.method(vtoffset=5, dispid=1610809347, type=METHOD, name="AddFromRslFile", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=STRING,type=ARRAY] ModuleName, [in,out,size=1,elementType=STRING,type=ARRAY] RslFileName, [in,type=BOOLEAN] RegisterAssembly, [iid=655C7C21-14E0-466B-B5FA-1EC9749E18AF,thread=AUTO,type=DISPATCH] return) */
  public native refaldriver._RefalModule AddFromRslFile(String[] ModuleName, String[] RslFileName, boolean RegisterAssembly);

  /** @com.method(vtoffset=6, dispid=1610809348, type=METHOD, name="AddFromRefFile", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=STRING,type=ARRAY] ModuleName, [in,out,size=1,elementType=STRING,type=ARRAY] RefFileName, [in,type=BOOLEAN] RegisterAssembly, [iid=655C7C21-14E0-466B-B5FA-1EC9749E18AF,thread=AUTO,type=DISPATCH] return) */
  public native refaldriver._RefalModule AddFromRefFile(String[] ModuleName, String[] RefFileName, boolean RegisterAssembly);

  /** @com.method(vtoffset=7, dispid=1610809349, type=METHOD, name="Add", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=DISPATCH,type=ARRAY] RefalModule, [in,out,size=1,elementType=BOOLEAN,type=ARRAY] RegisterAssembly) */
  public native void Add(refaldriver._RefalModule[] RefalModule, boolean[] RegisterAssembly);

  /** @com.method(vtoffset=8, dispid=0, type=PROPGET, name="Item", name2="getItem", addFlagsVtable=4)
      @com.parameters([in,out,elementType=VARIANT,type=PTR] vntIndexKey, [iid=655C7C21-14E0-466B-B5FA-1EC9749E18AF,thread=AUTO,type=DISPATCH] return) */
  public native refaldriver._RefalModule getItem(Variant vntIndexKey);

  /** @com.method(vtoffset=9, dispid=1745027072, type=PROPGET, name="Count", name2="getCount", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getCount();

  /** @com.method(vtoffset=10, dispid=1610809350, type=METHOD, name="Remove", addFlagsVtable=4)
      @com.parameters([in,out,elementType=VARIANT,type=PTR] vntIndexKey) */
  public native void Remove(Variant vntIndexKey);

  /** @com.method(vtoffset=11, dispid=4294967292, type=PROPGET, name="NewEnum", name2="getNewEnum", addFlagsVtable=4)
      @com.parameters([iid=00000000-0000-0000-C000-000000000046,thread=AUTO,type=OBJECT] return)
      @hidden */
  public native stdole2.IEnumVARIANT getNewEnum();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x67ce9e64, (short)0x2a56, (short)0x4d73, (byte)0x95, (byte)0x6c, (byte)0x28, (byte)0x67, (byte)0x62, (byte)0x3, (byte)0xd9, (byte)0x32);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0x91cbd716, (short)0x6eda, (short)0x47bd, (byte)0xb4, (byte)0xd0, (byte)0xa2, (byte)0x59, (byte)0xaf, (byte)0x3f, (byte)0xbd, (byte)0x70);
}
