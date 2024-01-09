package self.com.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor // 인자 3개가 모두 담아있는 생성자를 만드는 것
@NoArgsConstructor //비어있는 생성자 생성
public class SampleDTO2 {
    private String id;
    private String name;
    private int price;
}
