package com.petebevin.markdown;

import java.util.HashMap;
import java.util.Map;

public class Entities
{
    /**
     * A map of HTML 4.01 entities, taken from W3C website, without 
     * chars used in tags such as greater-than, less-than, ampersand and quotation mark.
     * This is the recommended map to use for a standard markdown use.
     * 
     * @see http://www.w3.org/TR/html401/sgml/entities.html
     */
    public static final Map<Character, String> HTML_401_NO_TAG = new HashMap<Character, String>() {
        {
            put(Character.valueOf((char) 160), "&#160;");
            put(Character.valueOf((char) 161), "&#161;");
            put(Character.valueOf((char) 162), "&#162;");
            put(Character.valueOf((char) 163), "&#163;");
            put(Character.valueOf((char) 164), "&#164;");
            put(Character.valueOf((char) 165), "&#165;");
            put(Character.valueOf((char) 166), "&#166;");
            put(Character.valueOf((char) 167), "&#167;");
            put(Character.valueOf((char) 168), "&#168;");
            put(Character.valueOf((char) 169), "&#169;");
            put(Character.valueOf((char) 170), "&#170;");
            put(Character.valueOf((char) 171), "&#171;");
            put(Character.valueOf((char) 172), "&#172;");
            put(Character.valueOf((char) 173), "&#173;");
            put(Character.valueOf((char) 174), "&#174;");
            put(Character.valueOf((char) 175), "&#175;");
            put(Character.valueOf((char) 176), "&#176;");
            put(Character.valueOf((char) 177), "&#177;");
            put(Character.valueOf((char) 178), "&#178;");
            put(Character.valueOf((char) 179), "&#179;");
            put(Character.valueOf((char) 180), "&#180;");
            put(Character.valueOf((char) 181), "&#181;");
            put(Character.valueOf((char) 182), "&#182;");
            put(Character.valueOf((char) 183), "&#183;");
            put(Character.valueOf((char) 184), "&#184;");
            put(Character.valueOf((char) 185), "&#185;");
            put(Character.valueOf((char) 186), "&#186;");
            put(Character.valueOf((char) 187), "&#187;");
            put(Character.valueOf((char) 188), "&#188;");
            put(Character.valueOf((char) 189), "&#189;");
            put(Character.valueOf((char) 190), "&#190;");
            put(Character.valueOf((char) 191), "&#191;");
            put(Character.valueOf((char) 192), "&#192;");
            put(Character.valueOf((char) 193), "&#193;");
            put(Character.valueOf((char) 194), "&#194;");
            put(Character.valueOf((char) 195), "&#195;");
            put(Character.valueOf((char) 196), "&#196;");
            put(Character.valueOf((char) 197), "&#197;");
            put(Character.valueOf((char) 198), "&#198;");
            put(Character.valueOf((char) 199), "&#199;");
            put(Character.valueOf((char) 200), "&#200;");
            put(Character.valueOf((char) 201), "&#201;");
            put(Character.valueOf((char) 202), "&#202;");
            put(Character.valueOf((char) 203), "&#203;");
            put(Character.valueOf((char) 204), "&#204;");
            put(Character.valueOf((char) 205), "&#205;");
            put(Character.valueOf((char) 206), "&#206;");
            put(Character.valueOf((char) 207), "&#207;");
            put(Character.valueOf((char) 208), "&#208;");
            put(Character.valueOf((char) 209), "&#209;");
            put(Character.valueOf((char) 210), "&#210;");
            put(Character.valueOf((char) 211), "&#211;");
            put(Character.valueOf((char) 212), "&#212;");
            put(Character.valueOf((char) 213), "&#213;");
            put(Character.valueOf((char) 214), "&#214;");
            put(Character.valueOf((char) 215), "&#215;");
            put(Character.valueOf((char) 216), "&#216;");
            put(Character.valueOf((char) 217), "&#217;");
            put(Character.valueOf((char) 218), "&#218;");
            put(Character.valueOf((char) 219), "&#219;");
            put(Character.valueOf((char) 220), "&#220;");
            put(Character.valueOf((char) 221), "&#221;");
            put(Character.valueOf((char) 222), "&#222;");
            put(Character.valueOf((char) 223), "&#223;");
            put(Character.valueOf((char) 224), "&#224;");   // agrave
            put(Character.valueOf((char) 225), "&#225;");
            put(Character.valueOf((char) 226), "&#226;");
            put(Character.valueOf((char) 227), "&#227;");
            put(Character.valueOf((char) 228), "&#228;");
            put(Character.valueOf((char) 229), "&#229;");
            put(Character.valueOf((char) 230), "&#230;");
            put(Character.valueOf((char) 231), "&#231;");
            put(Character.valueOf((char) 232), "&#232;");   // egrave
            put(Character.valueOf((char) 233), "&#233;");
            put(Character.valueOf((char) 234), "&#234;");
            put(Character.valueOf((char) 235), "&#235;");
            put(Character.valueOf((char) 236), "&#236;");
            put(Character.valueOf((char) 237), "&#237;");
            put(Character.valueOf((char) 238), "&#238;");
            put(Character.valueOf((char) 239), "&#239;");
            put(Character.valueOf((char) 240), "&#240;");
            put(Character.valueOf((char) 241), "&#241;");
            put(Character.valueOf((char) 242), "&#242;");   // ograve
            put(Character.valueOf((char) 243), "&#243;");
            put(Character.valueOf((char) 244), "&#244;");
            put(Character.valueOf((char) 245), "&#245;");
            put(Character.valueOf((char) 246), "&#246;");
            put(Character.valueOf((char) 247), "&#247;");
            put(Character.valueOf((char) 248), "&#248;");
            put(Character.valueOf((char) 249), "&#249;");
            put(Character.valueOf((char) 250), "&#250;");
            put(Character.valueOf((char) 251), "&#251;");
            put(Character.valueOf((char) 252), "&#252;");
            put(Character.valueOf((char) 253), "&#253;");
            put(Character.valueOf((char) 254), "&#254;");
            put(Character.valueOf((char) 255), "&#255;");
            put(Character.valueOf((char) 402), "&#402;");
            put(Character.valueOf((char) 913), "&#913;");
            put(Character.valueOf((char) 914), "&#914;");
            put(Character.valueOf((char) 915), "&#915;");
            put(Character.valueOf((char) 916), "&#916;");
            put(Character.valueOf((char) 917), "&#917;");
            put(Character.valueOf((char) 918), "&#918;");
            put(Character.valueOf((char) 919), "&#919;");
            put(Character.valueOf((char) 920), "&#920;");
            put(Character.valueOf((char) 921), "&#921;");
            put(Character.valueOf((char) 922), "&#922;");
            put(Character.valueOf((char) 923), "&#923;");
            put(Character.valueOf((char) 924), "&#924;");
            put(Character.valueOf((char) 925), "&#925;");
            put(Character.valueOf((char) 926), "&#926;");
            put(Character.valueOf((char) 927), "&#927;");
            put(Character.valueOf((char) 928), "&#928;");
            put(Character.valueOf((char) 929), "&#929;");
            put(Character.valueOf((char) 931), "&#931;");
            put(Character.valueOf((char) 932), "&#932;");
            put(Character.valueOf((char) 933), "&#933;");
            put(Character.valueOf((char) 934), "&#934;");
            put(Character.valueOf((char) 935), "&#935;");
            put(Character.valueOf((char) 936), "&#936;");
            put(Character.valueOf((char) 937), "&#937;");
            put(Character.valueOf((char) 945), "&#945;");
            put(Character.valueOf((char) 946), "&#946;");
            put(Character.valueOf((char) 947), "&#947;");
            put(Character.valueOf((char) 948), "&#948;");
            put(Character.valueOf((char) 949), "&#949;");
            put(Character.valueOf((char) 950), "&#950;");
            put(Character.valueOf((char) 951), "&#951;");
            put(Character.valueOf((char) 952), "&#952;");
            put(Character.valueOf((char) 953), "&#953;");
            put(Character.valueOf((char) 954), "&#954;");
            put(Character.valueOf((char) 955), "&#955;");
            put(Character.valueOf((char) 956), "&#956;");
            put(Character.valueOf((char) 957), "&#957;");
            put(Character.valueOf((char) 958), "&#958;");
            put(Character.valueOf((char) 959), "&#959;");
            put(Character.valueOf((char) 960), "&#960;");
            put(Character.valueOf((char) 961), "&#961;");
            put(Character.valueOf((char) 962), "&#962;");
            put(Character.valueOf((char) 963), "&#963;");
            put(Character.valueOf((char) 964), "&#964;");
            put(Character.valueOf((char) 965), "&#965;");
            put(Character.valueOf((char) 966), "&#966;");
            put(Character.valueOf((char) 967), "&#967;");
            put(Character.valueOf((char) 968), "&#968;");
            put(Character.valueOf((char) 969), "&#969;");
            put(Character.valueOf((char) 977), "&#977;");
            put(Character.valueOf((char) 978), "&#978;");
            put(Character.valueOf((char) 982), "&#982;");
            put(Character.valueOf((char) 8226), "&#8226;");
            put(Character.valueOf((char) 8230), "&#8230;");
            put(Character.valueOf((char) 8242), "&#8242;");
            put(Character.valueOf((char) 8243), "&#8243;");
            put(Character.valueOf((char) 8254), "&#8254;");
            put(Character.valueOf((char) 8260), "&#8260;");
            put(Character.valueOf((char) 8472), "&#8472;");
            put(Character.valueOf((char) 8465), "&#8465;");
            put(Character.valueOf((char) 8476), "&#8476;");
            put(Character.valueOf((char) 8482), "&#8482;");
            put(Character.valueOf((char) 8501), "&#8501;");
            put(Character.valueOf((char) 8592), "&#8592;");
            put(Character.valueOf((char) 8593), "&#8593;");
            put(Character.valueOf((char) 8594), "&#8594;");
            put(Character.valueOf((char) 8595), "&#8595;");
            put(Character.valueOf((char) 8596), "&#8596;");
            put(Character.valueOf((char) 8629), "&#8629;");
            put(Character.valueOf((char) 8656), "&#8656;");
            put(Character.valueOf((char) 8657), "&#8657;");
            put(Character.valueOf((char) 8658), "&#8658;");
            put(Character.valueOf((char) 8659), "&#8659;");
            put(Character.valueOf((char) 8660), "&#8660;");
            put(Character.valueOf((char) 8704), "&#8704;");
            put(Character.valueOf((char) 8706), "&#8706;");
            put(Character.valueOf((char) 8707), "&#8707;");
            put(Character.valueOf((char) 8709), "&#8709;");
            put(Character.valueOf((char) 8711), "&#8711;");
            put(Character.valueOf((char) 8712), "&#8712;");
            put(Character.valueOf((char) 8713), "&#8713;");
            put(Character.valueOf((char) 8715), "&#8715;");
            put(Character.valueOf((char) 8719), "&#8719;");
            put(Character.valueOf((char) 8721), "&#8721;");
            put(Character.valueOf((char) 8722), "&#8722;");
            put(Character.valueOf((char) 8727), "&#8727;");
            put(Character.valueOf((char) 8730), "&#8730;");
            put(Character.valueOf((char) 8733), "&#8733;");
            put(Character.valueOf((char) 8734), "&#8734;");
            put(Character.valueOf((char) 8736), "&#8736;");
            put(Character.valueOf((char) 8743), "&#8743;");
            put(Character.valueOf((char) 8744), "&#8744;");
            put(Character.valueOf((char) 8745), "&#8745;");
            put(Character.valueOf((char) 8746), "&#8746;");
            put(Character.valueOf((char) 8747), "&#8747;");
            put(Character.valueOf((char) 8756), "&#8756;");
            put(Character.valueOf((char) 8764), "&#8764;");
            put(Character.valueOf((char) 8773), "&#8773;");
            put(Character.valueOf((char) 8776), "&#8776;");
            put(Character.valueOf((char) 8800), "&#8800;");
            put(Character.valueOf((char) 8801), "&#8801;");
            put(Character.valueOf((char) 8804), "&#8804;");
            put(Character.valueOf((char) 8805), "&#8805;");
            put(Character.valueOf((char) 8834), "&#8834;");
            put(Character.valueOf((char) 8835), "&#8835;");
            put(Character.valueOf((char) 8836), "&#8836;");
            put(Character.valueOf((char) 8838), "&#8838;");
            put(Character.valueOf((char) 8839), "&#8839;");
            put(Character.valueOf((char) 8853), "&#8853;");
            put(Character.valueOf((char) 8855), "&#8855;");
            put(Character.valueOf((char) 8869), "&#8869;");
            put(Character.valueOf((char) 8901), "&#8901;");
            put(Character.valueOf((char) 8968), "&#8968;");
            put(Character.valueOf((char) 8969), "&#8969;");
            put(Character.valueOf((char) 8970), "&#8970;");
            put(Character.valueOf((char) 8971), "&#8971;");
            put(Character.valueOf((char) 9001), "&#9001;");
            put(Character.valueOf((char) 9002), "&#9002;");
            put(Character.valueOf((char) 9674), "&#9674;");
            put(Character.valueOf((char) 9824), "&#9824;");
            put(Character.valueOf((char) 9827), "&#9827;");
            put(Character.valueOf((char) 9829), "&#9829;");
            put(Character.valueOf((char) 9830), "&#9830;");
            put(Character.valueOf((char) 338), "&#338;");
            put(Character.valueOf((char) 339), "&#339;");
            put(Character.valueOf((char) 352), "&#352;");
            put(Character.valueOf((char) 353), "&#353;");
            put(Character.valueOf((char) 376), "&#376;");
            put(Character.valueOf((char) 710), "&#710;");
            put(Character.valueOf((char) 732), "&#732;");
            put(Character.valueOf((char) 8194), "&#8194;");
            put(Character.valueOf((char) 8195), "&#8195;");
            put(Character.valueOf((char) 8201), "&#8201;");
            put(Character.valueOf((char) 8204), "&#8204;");
            put(Character.valueOf((char) 8205), "&#8205;");
            put(Character.valueOf((char) 8206), "&#8206;");
            put(Character.valueOf((char) 8207), "&#8207;");
            put(Character.valueOf((char) 8211), "&#8211;");
            put(Character.valueOf((char) 8212), "&#8212;");
            put(Character.valueOf((char) 8216), "&#8216;");
            put(Character.valueOf((char) 8217), "&#8217;");
            put(Character.valueOf((char) 8218), "&#8218;");
            put(Character.valueOf((char) 8220), "&#8220;");
            put(Character.valueOf((char) 8221), "&#8221;");
            put(Character.valueOf((char) 8222), "&#8222;");
            put(Character.valueOf((char) 8224), "&#8224;");
            put(Character.valueOf((char) 8225), "&#8225;");
            put(Character.valueOf((char) 8240), "&#8240;");
            put(Character.valueOf((char) 8249), "&#8249;");
            put(Character.valueOf((char) 8250), "&#8250;");
            put(Character.valueOf((char) 8364), "&#8364;");
        }
    };

    /**
     * Full map of HTML 4.01 entities, taken from W3C website.
     * 
     * @see http://www.w3.org/TR/html401/sgml/entities.html
     */
    public static final Map<Character, String> HTML_401 = new HashMap<Character, String>(HTML_401_NO_TAG) {
        {
            put(Character.valueOf((char) 34), "&#34;"); // quotation mark
            put(Character.valueOf((char) 38), "&#38;"); // ampersand
            put(Character.valueOf((char) 60), "&#60;"); // less-than
            put(Character.valueOf((char) 62), "&#62;"); // greater-than
        }
    };

    public static String encode(String text, Map<Character, String> entities)
    {
        char[] dst = new char[text.length()];
        text.getChars(0, text.length(), dst, 0);
        int i = 0;
        for (char cn: dst)
        {
            String escaped = entities.get(Character.valueOf(cn));
            if (escaped != null) {
                text = replaceCharAt(text, i, escaped);
                i = i+(escaped.length());
            } else {
                i++;
            }
        }
        return text;
    }
    
    public static StringBuffer encode(StringBuffer text, Map<Character, String> entities)
    {
        char[] dst = new char[text.length()];
        text.getChars(0, text.length(), dst, 0);
        int i = 0;
        for (char cn: dst)
        {
            String escaped = entities.get(Character.valueOf(cn));
            if (escaped != null) {
                text.replace(i, i+1, escaped);
                i = i+(escaped.length());
            } else {
                i++;
            }
        }
        return text;
    }

    private static String replaceCharAt(String s, int pos, String replacement) {
        return s.substring(0,pos) + replacement + s.substring(pos+1);
    }

}