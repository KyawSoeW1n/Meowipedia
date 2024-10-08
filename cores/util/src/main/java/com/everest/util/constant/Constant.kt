package com.everest.util.constant

/**
-   `pageSize` = _number of items to load from PagingSource ( should be larger than number of visible item on Screen )_
-   `initialLoadSize` = _load size for the first initial request from PagingSource ( larger than `pageSize` : default = `pageSize` * 3 )_
-   `maxSize` = _maximum number of items loaded into PagingData before pages should be dropped, size of items cached on Memory ( default = MAX_SIZE_UNBOUNDED : all items are cached )_
 */
object Constant {
    const val PAGE_SIZE = 50
    const val START_PAGE = 1
}
