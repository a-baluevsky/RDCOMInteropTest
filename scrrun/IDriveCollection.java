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

// Dual interface IDriveCollection
/** @com.interface(iid=C7C3F5A1-88A3-11D0-ABCB-00A0C90FFFC0, thread=AUTO, type=DUAL) */
public interface IDriveCollection extends IUnknown
{
  /** @com.method(vtoffset=4, dispid=0, type=PROPGET, name="Item", name2="getItem", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] Key, [iid=C7C3F5A0-88A3-11D0-ABCB-00A0C90FFFC0,thread=AUTO,type=DISPATCH] return) */
  public scrrun.IDrive getItem(Variant Key);

  /** @com.method(vtoffset=5, dispid=4294967292, type=PROPGET, name="_NewEnum", name2="get_NewEnum", addFlagsVtable=4)
      @com.parameters([iid=00000000-0000-0000-C000-000000000046,thread=AUTO,type=OBJECT] return)
      @hidden */
  public IUnknown get_NewEnum();

  /** @com.method(vtoffset=6, dispid=1, type=PROPGET, name="Count", name2="getCount", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getCount();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xc7c3f5a1, (short)0x88a3, (short)0x11d0, (byte)0xab, (byte)0xcb, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0xff, (byte)0xc0);
}
