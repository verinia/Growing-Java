package item;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
@Getter
public class Item {
    private final int id;
    private final int price;
    private final String name;
}
