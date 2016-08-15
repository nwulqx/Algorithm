//js版QuickSort，快速排序
function less(a,b){
	return a-b<0?true:false;
}
function exch(a,i,j){
	if(i==j) return;
	a[i] = a[i]^a[j];
	a[j] = a[i]^a[j];
	a[i] = a[i]^a[j];
}
function partition(a,lo,hi){
	var i = lo;
	var j = hi+1;
	while(true){
		//从左向右寻找大于a[lo]的数
		while(less(a[++i],a[lo]))
			if(i==hi) break;
		//从右至左寻找小于a[lo]的数
		while(less(a[lo],a[--j]))
			if(j==lo) break;
		if(i>=j) break;
		exch(a,i,j);
	}
	if(j==lo) return j;
	exch(a,lo,j);
	return j;
}
function sort(a,lo,hi){
	if(lo>=hi) return;
	var j = partition(a,lo,hi);
	sort(a,lo,j-1);
	sort(a,j+1,hi);
}