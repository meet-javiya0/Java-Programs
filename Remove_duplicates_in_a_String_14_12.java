public class Remove_duplicates_in_a_String_14_12 {
    public static void removeDup(String str, int ind, StringBuilder newstr, boolean map[]) {
        if (ind == str.length()) {
            System.out.println(newstr);
            return;
        }

        char curChar = str.charAt(ind);
        // Check if current character present in new String or not if present go to next
        // character else change the map to true for that character and append it in new
        // String
        if (map[curChar - 'a'] == true) {
            removeDup(str, ind + 1, newstr, map);
        } else {
            map[curChar - 'a'] = true;
            removeDup(str, ind + 1, newstr.append(curChar), map);
        }
    }

    public static void main(String args[]) {
        removeDup("meetjaviya", 0, new StringBuilder(""), new boolean[26]);
    }
}

// Question: Remove duplicates in a String