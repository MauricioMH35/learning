package org.learning.regex;

public class Regex {
    public static void main(String[] args) {
        System.out.println("Batata doce");
        String strDoce = "Exite DocE mais dOce que a batata DoCe";
        String strDoceReplace = strDoce.replaceAll("(?i)doce", "DOCINHO");
        System.out.println(strDoceReplace + "\n");

        System.out.println("URL");
        String url = "www.meu-site.com.br/customers-2021.html";
        String regularExprUrl = "(www\\.meu-site\\.com\\.br)/(\\w{2,})-(\\d{2,4}).html";
        String replaceUrl = "http://$1/$3/$2.jsp";
        String newUrl = url.replaceAll(regularExprUrl, replaceUrl);
        System.out.println(newUrl);
    }
}
