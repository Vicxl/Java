public class Test7(){
	public static void main(String[] args){
		String str = "ab-ab-ab-ab";
		String strToRemove = "-";
		System.out.println(removeAll(str, strToRemove));
	}
	    /**
     * 移除字符串中所有给定字符串
     * 例：removeAll("aa-bb-cc-dd", "-") => aabbccdd
     *
     * @param str         字符串
     * @param strToRemove 被移除的字符串
     * @return 移除后的字符串
     */
    public static String removeAll(CharSequence str, CharSequence strToRemove) {
        if(str == null){
			return null;
		} 
		String st1 = str;
		st1 = st1.replace("strToRemove", " ");
        return st1;
    }
}