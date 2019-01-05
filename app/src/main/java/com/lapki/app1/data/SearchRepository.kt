package com.lapki.app1.data

class SearchRepository(val apiService: BashImApiService){

    fun searchQuotes(site: String,name:String): io.reactivex.Observable<List<Quote>> {
        return apiService.searchQuotes(site,name,50)
    }
    fun searchSourcesOfQuotes(): io.reactivex.Observable<List<SourcesOfQuotes>> {
        return apiService.searchSources()
    }



}