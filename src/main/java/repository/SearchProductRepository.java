package repository;
import datamodel.SearchModel;

public class SearchProductRepository {
    private SearchProductRepository() {
    }

    public static SearchModel getSearch() {
        return SearchModel.builder()
                .productFirstName("iphone")
                .productSecondName("macbook")
                .build();
    }
}
