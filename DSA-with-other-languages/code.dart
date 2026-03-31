void main(){
  var arr = [1,2,1,1,1,1,1,1,13,3,3,3,1];
  int count = 0;
  int target = 0;
  for (int i = 0 ; i < arr.length ; i++){
    if (count == 0) target = i;
    if (arr[target] == arr[i]) count++;
    else count--;
  }
  print(arr[target]);
  }

