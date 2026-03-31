import random
class dsa :
    def __inti__(self):
        pass 
    def consecutiveZeros(self,arr):
        count = 0
        ans = 0
        for i in arr:
            if i == 0:
                ans = max(ans,count)
                count = 0
            elif i == 1:
                count+=1
        print(ans)
        print(arr)
    
    def longestSubarray(self,arr,target):
        print(arr)
        sum = 0
        index = 0
        for i in range(0,len(arr)):
          sum =0
          for j in range(i,len(arr)):
              sum += arr[j]
              if sum == target:
                  index = max(j-i+1,index)
                  
        print(index)

a = dsa()
arr = [random.randrange(0,7) for i in range(10)]
a.longestSubarray([2, 2, 5, 2, 2, 0, 6, 6, 1, 2],11)


