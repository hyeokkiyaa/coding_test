class Solution {
	public int solution(String t, String p) {
		int answer = 0;
		int len_p = p.length();
		long long_p = Long.parseLong(p);
		for (int i = 0; i <= t.length() - len_p; i++) {
			String num = t.substring(i, i + len_p);
			long long_num = Long.parseLong(num);
			if (long_num <= long_p) {
				answer++;
			}
		 }

		return answer;
	}
}
