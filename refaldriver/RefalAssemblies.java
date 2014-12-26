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

/** @com.class(classid=C19A3733-92A0-4CBA-8597-F58024943CE4,DynamicCasts) 
    @com.interface(iid=4133908E-0E93-45F5-B1C0-ED17DA78BFE4, thread=AUTO, type=DUAL) */
public class RefalAssemblies implements IUnknown,com.ms.com.NoAutoScripting,refaldriver._RefalAssemblies
{
  /** @com.method(vtoffset=4, dispid=1610809346, type=METHOD, name="AddNew", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=STRING,type=ARRAY] AssemblyName, [iid=A4E7EE28-0B57-4E63-A058-7A91997E8530,thread=AUTO,type=DISPATCH] return) */
  public native refaldriver._RefalAssembly AddNew(String[] AssemblyName);

  /** @com.method(vtoffset=5, dispid=0, type=PROPGET, name="Item", name2="getItem", addFlagsVtable=4)
      @com.parameters([in,out,elementType=VARIANT,type=PTR] vntIndexKey, [iid=A4E7EE28-0B57-4E63-A058-7A91997E8530,thread=AUTO,type=DISPATCH] return)
      @hidden */
  public native refaldriver._RefalAssembly getItem(Variant vntIndexKey);

  /** @com.method(vtoffset=6, dispid=1745027072, type=PROPGET, name="Count", name2="getCount", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getCount();

  /** @com.method(vtoffset=7, dispid=1610809347, type=METHOD, name="Remove", addFlagsVtable=4)
      @com.parameters([in,out,elementType=VARIANT,type=PTR] vntIndexKey) */
  public native void Remove(Variant vntIndexKey);

  /** @com.method(vtoffset=8, dispid=4294967292, type=PROPGET, name="NewEnum", name2="getNewEnum", addFlagsVtable=4)
      @com.parameters([iid=00000000-0000-0000-C000-000000000046,thread=AUTO,type=OBJECT] return)
      @hidden */
  public native stdole2.IEnumVARIANT getNewEnum();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x4133908e, (short)0xe93, (short)0x45f5, (byte)0xb1, (byte)0xc0, (byte)0xed, (byte)0x17, (byte)0xda, (byte)0x78, (byte)0xbf, (byte)0xe4);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0xc19a3733, (short)0x92a0, (short)0x4cba, (byte)0x85, (byte)0x97, (byte)0xf5, (byte)0x80, (byte)0x24, (byte)0x94, (byte)0x3c, (byte)0xe4);
}
