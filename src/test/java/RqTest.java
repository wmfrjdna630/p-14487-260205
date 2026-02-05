import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RqTest {

    @Test
    @DisplayName(value = "명령 : 삭제?id=1 일때, rq.getActionName() - 삭제")
    void t1(){

        Rq rq = new Rq("삭제?id=1");
        String actionName = rq.getActionName();
        assertThat(actionName).isEqualTo("삭제");
    }

    @Test
    @DisplayName(value = "명령 : 수정?id=1 일때, rq.getActionName() - 수정")
    void t2(){

        Rq rq = new Rq("수정?id=1");
        String actionName = rq.getActionName();
        assertThat(actionName).isEqualTo("수정");
    }

    @Test
    @DisplayName(value = "명령 : 수정?id=1 일때, rq.getParam(\"id\") -> 1")
    void t3(){

        Rq rq = new Rq("수정?id=1");
        int rst = rq.getParam("id");
        assertThat(rst).isEqualTo(1);

    }

}
