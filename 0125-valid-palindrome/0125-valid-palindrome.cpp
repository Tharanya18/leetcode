class Solution {
public:
    bool isPalindrome(string s) {
      string cleaned="";
      for(char c:s )
      {
        if(isalnum(c))
        cleaned+=tolower(c);
      }
      int front=0,end=cleaned.length()-1;
      while(front<end)
      {
        if(cleaned[front]!=cleaned[end])
        return false;
        front++;
        end--;
      }
      return true;
    }
};