class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> strLists = new ArrayList<>();
		Map<String, List<String>> strMap = new HashMap<>();
		for (String str : strs) {
			int[] arr = new int[26];
			for (char ch : str.toCharArray()) {
				arr[ch - 'a'] ++;
			}
			String key = transInts2Str(arr);
      //如果不存在key，则添加
			strMap.putIfAbsent(key, new ArrayList<>());
			strMap.get(key).add(str);
		}
		for (List<String> strList : strMap.values()) {
			strLists.add(strList);
		}
		return strLists;
	}

  //将整型数组转换为字符串
	private String transInts2Str(int[] arr) {
		StringBuffer sb = new StringBuffer();
		for (int i : arr) {
			sb.append(i);
		}
		return sb.toString();
	}
}
