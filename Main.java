package sample;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, String[]>map= new HashMap<>();
		
		
		String[] a = {"  *  ", " * * ", "*   *", "*   *", "*****", "*   *", "*   *"};
        String[] b = {"**** ", "*   *", "*   *", "**** ", "*   *", "*   *", "**** "};
        String[] c = {" *** ", "*   *", "*    ", "*    ", "*    ", "*   *", " *** "};
        String[] d = {"***  ", "*  * ", "*   *", "*   *", "*   *", "*  * ", "***  "};
        String[] e = {"*****", "*    ", "*    ", "**** ", "*    ", "*    ", "*****"};
        String[] f = {"*****", "*    ", "*    ", "**** ", "*    ", "*    ", "*    "};
        String[] g = {" *** ", "*   *", "*    ", "* ***", "*   *", "*   *", " ****"};
        String[] h = {"*   *", "*   *", "*   *", "*****", "*   *", "*   *", "*   *"};
        String[] i = {" *** ", "  *  ", "  *  ", "  *  ", "  *  ", "  *  ", " *** "};
        String[] j = {"  ***", "   * ", "   * ", "   * ", "   * ", "*  * ", " **  "};
        String[] k = {"*   *", "*  * ", "* *  ", "**   ", "* *  ", "*  * ", "*   *"};
        String[] l = {"*    ", "*    ", "*    ", "*    ", "*    ", "*    ", "*****"};
        String[] m = {"*   *", "** **", "* * *", "* * *", "*   *", "*   *", "*   *"};
        String[] n = {"*   *", "*   *", "**  *", "* * *", "*  **", "*   *", "*   *"};
        String[] o = {" *** ", "*   *", "*   *", "*   *", "*   *", "*   *", " *** "};
        String[] p = {"**** ", "*   *", "*   *", "**** ", "*    ", "*    ", "*    "};
        String[] q = {" *** ", "*   *", "*   *", "*   *", "* * *", "*  * ", " ** *"};
        String[] r = {"**** ", "*   *", "*   *", "**** ", "* *  ", "*  * ", "*   *"};
        String[] s = {" ****", "*    ", "*    ", " *** ", "    *", "    *", "**** "};
        String[] t = {"*****", "  *  ", "  *  ", "  *  ", "  *  ", "  *  ", "  *  "};
        String[] u = {"*   *", "*   *", "*   *", "*   *", "*   *", "*   *", " *** "};
        String[] v = {"*   *", "*   *", "*   *", "*   *", "*   *", " * * ", "  *  "};
        String[] w = {"*   *", "*   *", "*   *", "* * *", "* * *", "* * *", " * * "};
        String[] x = {"*   *", "*   *", " * * ", "  *  ", " * * ", "*   *", "*   *"};
        String[] y = {"*   *", "*   *", "*   *", " *** ", "  *  ", "  *  ", "  *  "};
        String[] z = {"*****", "    *", "   * ", "  *  ", " *   ", "*    ", "*****"};

       map.put("a", a);
        map.put("b", b);
       map.put("c", c);
       map.put("d", d);
       map.put("e", e);
       map.put("f", f);
       map.put("g", g);
       map.put("h", h);
       map.put("i", i);
       map.put("j", j);
       map.put("k", k);
       map.put("l", l);
       map.put("m", m);
       map.put("n", n);
       map.put("o", o);
       map.put("p", p);
       map.put("q", q);
       map.put("r", r);
       map.put("s", s);
       map.put("t", t);
       map.put("u", u);
       map.put("v", v);
       map.put("w", w);
       map.put("x", x);
       map.put("y", y);
       map.put("z", z);
        
		
		
		
		
		
		
		
		Alphabet englishAlphabet = new Alphabet(map);
		
		PrintingTxtANSII pr = new PrintingTxtANSII("vasia molodets", englishAlphabet);
		
		pr.printANSII();		

	}

}
