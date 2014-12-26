//
// Auto-generated using JActiveX.EXE 5.00.2918
//   ("C:\Program Files\Microsoft Visual Studio\VJ98\jactivex.exe" /wfc  /w /xi /X:rkc /l "C:\DOCUME~1\a\LOCALS~1\Temp\jvcC0.tmp" /nologo /d "C:\Projects\JRefalDriver\RDCOMInteropTest" "C:\WINDOWS\System32\scrrun.dll")
//
// WARNING: Do not remove the comments that include "@com" directives.
// This source file must be compiled by a @com-aware compiler.
// If you are using the Microsoft Visual J++ compiler, you must use
// version 1.02.3920 or later. Previous versions will not issue an error
// but will not generate COM-enabled class files.
//

package scrrun;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;

/** @com.class(classid=EE09B103-97E0-11CF-978F-00A02463E06F,DynamicCasts) 
    @com.interface(iid=42C642C1-97E1-11CF-978F-00A02463E06F, thread=AUTO, type=DUAL) */
public class Dictionary implements IUnknown,com.ms.com.NoAutoScripting,scrrun.IDictionary
{
  /** @com.method(vtoffset=4, dispid=0, type=PROPPUTREF, name="Item", name2="putItem", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Key, [in,elementType=VARIANT,type=PTR] pRetItem) */
  public native void setItem(Variant Key, Variant pRetItem);

  // setItem UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public native void setItem(Variant Key, Variant pRetItem);

  /** @com.method(vtoffset=6, dispid=0, type=PROPGET, name="Item", name2="getItem", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Key, [type=VARIANT] return) */
  public native Variant getItem(Variant Key);

  /** @com.method(vtoffset=7, dispid=1, type=METHOD, name="Add", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Key, [in,elementType=VARIANT,type=PTR] Item) */
  public native void Add(Variant Key, Variant Item);

  /** @com.method(vtoffset=8, dispid=2, type=PROPGET, name="Count", name2="getCount", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getCount();

  /** @com.method(vtoffset=9, dispid=3, type=METHOD, name="Exists", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Key, [type=BOOLEAN] return) */
  public native boolean Exists(Variant Key);

  /** @com.method(vtoffset=10, dispid=4, type=METHOD, name="Items", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public native Variant Items();

  /** @com.method(vtoffset=11, dispid=5, type=PROPPUT, name="Key", name2="putKey", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Key, [in,elementType=VARIANT,type=PTR] _jcomparam_1) */
  public native void setKey(Variant Key, Variant _jcomparam_1);

  /** @com.method(vtoffset=12, dispid=6, type=METHOD, name="Keys", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public native Variant Keys();

  /** @com.method(vtoffset=13, dispid=7, type=METHOD, name="Remove", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Key) */
  public native void Remove(Variant Key);

  /** @com.method(vtoffset=14, dispid=8, type=METHOD, name="RemoveAll", addFlagsVtable=4)
      @com.parameters() */
  public native void RemoveAll();

  /** @com.method(vtoffset=15, dispid=9, type=PROPPUT, name="CompareMode", name2="putCompareMode", addFlagsVtable=4)
      @com.parameters([in,type=I4] pcomp) */
  public native void setCompareMode(int pcomp);

  /** @com.method(vtoffset=16, dispid=9, type=PROPGET, name="CompareMode", name2="getCompareMode", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getCompareMode();

  /** @com.method(vtoffset=17, dispid=4294967292, type=METHOD, name="_NewEnum", addFlagsVtable=4)
      @com.parameters([iid=00000000-0000-0000-C000-000000000046,thread=AUTO,type=OBJECT] return) */
  public native IUnknown _NewEnum();

  /** @com.method(vtoffset=18, dispid=10, type=PROPGET, name="HashVal", name2="getHashVal", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Key, [type=VARIANT] return)
      @hidden */
  public native Variant getHashVal(Variant Key);


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x42c642c1, (short)0x97e1, (short)0x11cf, (byte)0x97, (byte)0x8f, (byte)0x0, (byte)0xa0, (byte)0x24, (byte)0x63, (byte)0xe0, (byte)0x6f);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0xee09b103, (short)0x97e0, (short)0x11cf, (byte)0x97, (byte)0x8f, (byte)0x0, (byte)0xa0, (byte)0x24, (byte)0x63, (byte)0xe0, (byte)0x6f);
}
