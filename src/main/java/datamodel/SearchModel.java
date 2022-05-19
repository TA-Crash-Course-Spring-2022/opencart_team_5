package datamodel;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SearchModel {
    private String productFirstName;
    private String productSecondName;

}
