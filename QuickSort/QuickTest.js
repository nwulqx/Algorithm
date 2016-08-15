function  QuickDemo(arr){
	 if(arr.length<=1) return arr;
	 var pivotIndex = arr[0];
	 var pivot = arr.splice(pivot,1)[0];
	 var left = [];
	 var right = [];
	 for(var i=0;i<arr.length;i++){
		if(arr[i]<pivot) 
			left.push(arr[i]);
		else
			right.push(arr[i]);
	 }
	 return QuickDemo(left).concat([pivot],QuickDemo(right));
}