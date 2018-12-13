(a)
public String decodeString(ArrayList<StringParts> parts){
  String tmp = "";
  for(StringPart i : parts){
    tmp += masterString.substring(i.getStart(), i.getStart() + i.getLength());
  }
  return tmp;
}
  
(b)
public ArrayList<StringPart> encodeString(String word)
    ArrayList<StringPart> temp = new ArrayList<StringPart>();
