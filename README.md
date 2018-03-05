# CountNumsDefect

The idea is to create a recusrive call to check current node's neighbor (N, E, S or W), and zero out on 
visited element, when we loop through the grid, if its value is 1 we start from neighbor to recursively visit rest
of linked neighbour which is 1, and mark them 0.  This way all the "linked neighbour" will be visited, 
so we can ignore it as part of count. 
 
