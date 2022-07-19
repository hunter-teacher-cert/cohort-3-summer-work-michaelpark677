public class Annotate {

public statics int linearSearch(int value, ArrayList<Integer> data) {

  int foundIndex = -1;

  for (int i=0; i < data.size(); i++) {

    int element = data.get(i);

    if (element == value) {
      foundIndex = i;
      break;
      }
    }
  return foundIndex;
}

public static void main (String[] args) {

int value = 5;
int[] = new {1,2,5,3,7};
  
  System.out.println(linearSearch(value, data));
}
}