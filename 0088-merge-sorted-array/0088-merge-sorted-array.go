func merge(nums1 []int, m int, nums2 []int, n int) {
	if n+m == 0 {
		return
	} else {
		if m == 0 {
			copy(nums1, nums2)
		} else if n == 0 {
			
		} else {
			var firtsIndex, secondIndex int = 0, 0
			var aux []int
			for i := 0; i < m; i++ {
				aux = append(aux, nums1[i])
			}
			for i := range m+n {
				if firtsIndex < m && secondIndex < n {
					if aux[firtsIndex] < nums2[secondIndex] && firtsIndex < m {
						nums1[i] = aux[firtsIndex]
						firtsIndex++
					} else if aux[firtsIndex] > nums2[secondIndex] && secondIndex < n {
						nums1[i] = nums2[secondIndex]
						secondIndex++
					}else {
						nums1[i] = aux[firtsIndex]
						firtsIndex++
					}
				} else if firtsIndex < m {
					nums1[i] = aux[firtsIndex]
					firtsIndex++
				} else if secondIndex < n {
					nums1[i] = nums2[secondIndex]
					secondIndex++
				}
			}
		}
	}
}