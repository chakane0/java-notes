## Heres some things you can do with an array

### Swap

```java
public static int swap(int[] arr, int idx1, int idx2) {
    int temp = arr[idx1];
    arr[idx1] = idx2;
    arr[idx2] = temp;
    return arr
}
```

