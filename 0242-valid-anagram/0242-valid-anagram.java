class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        // // HashSet<Character> set=new HashSet<>();
        // int s2=0;
        // int s1=0;
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     s2+=(int)ch;
        // }
        //  for(int i=0;i<t.length();i++){
        //     char ch=t.charAt(i);
        //     // if(!set.contains(ch))
        //     s1+=(int)ch;
        // }
        // if(s2==s1)
        //  return true;
        //  else 
        //  return false;

//         if(s.length() != t.length()) {
//             return false;
//         }

//         HashMap<Character, Integer> map = new HashMap<>();

//         // store frequency of characters from s
//         for(int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if(map.containsKey(ch)) {
//                 map.put(ch, map.get(ch) + 1);
//             } else {
//                 map.put(ch, 1);
//             }
//         }

//         // reduce frequency using t
//         for(int i = 0; i < t.length(); i++) {
//             char ch = t.charAt(i);

//             if(!map.containsKey(ch)) {
//                 return false;
//             }

//             map.put(ch, map.get(ch) - 1);

//             if(map.get(ch) == 0) {
//                 map.remove(ch);
//             }
//         }

//         return map.isEmpty();
//     }
// }
if(s.length() != t.length()) {
            return false;
        }

        int freq[] = new int[26];

        for(int i = 0; i < s.length(); i++) {

            freq[s.charAt(i) - 'a']++;

            freq[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}