
binarySearch( n, S[], key){
  low <- 0
  high <- n + 1

  while( low <= high && location = 0){
    mid <- low + (high - low) / 2
    if( S[mid] == key)
      return mid
    else if(S[mid] > key)
      high <- mid - 1
    else
      low <- mid + 1
      return -1
  }
}
