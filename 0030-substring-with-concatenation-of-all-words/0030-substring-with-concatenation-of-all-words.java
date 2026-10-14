class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int n = s.length();
        int wordLen = words[0].length();
        int sentenceDesireLen = wordLen * words.length;

        List<Integer> list = new ArrayList<>();
        HashMap<String, int[]> map = new HashMap<>();

        for (String word : words) {
            map.putIfAbsent(word, new int[] { 0, 0 });
            map.get(word)[0]++;
        }

        for (int i = 0; i < wordLen; i++) {
            int left = i, right = i;
            while (right <= n - wordLen && left <= n - sentenceDesireLen) {
                String word = s.substring(right, right + wordLen);
                if (map.containsKey(word)) {
                    int[] freq = map.get(word);
                    while (freq[0] == freq[1]) {
                        String prevWord = s.substring(left, left + wordLen);
                        map.get(prevWord)[1]--;
                        left += wordLen;
                    }
                    freq[1]++;
                } else {
                    while (left != right) {
                        String prevWord = s.substring(left, left + wordLen);
                        map.get(prevWord)[1]--;
                        left += wordLen;
                    }
                    left += wordLen;
                }
                right += wordLen;
                if (right - left == sentenceDesireLen) {
                    list.add(left);
                }
            }

            while (left != right) {
                String prevWord = s.substring(left, left + wordLen);
                map.get(prevWord)[1]--;
                left += wordLen;
            }
        }

        Collections.sort(list);
        return list;
    }
}