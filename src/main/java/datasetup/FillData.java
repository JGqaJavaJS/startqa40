package datasetup;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FillData {

    List<DataCommonDTO> list = new ArrayList<>();

    public List<DataCommonDTO> getList() {
        return list;
    }

    public List<DataCommonDTO> fillData() {
        UserDto userDto = new UserDto("email@1", 111);
        CarDTO carDTO1 = new CarDTO("model1", 11111);
        CarDTO carDTO2 = new CarDTO("model2", 22222);
        CarDTO[] cars = {carDTO1, carDTO2};
        DataCommonDTO dataCommonDTO = new DataCommonDTO(userDto, cars);
        list.add(dataCommonDTO);

//        list.add(new DataCommonDTO(
//                new UserDto("emeil2", 333),
//                Arrays.fill(new CarDTO("model3", 333333), new CarDTO("model4", 44444))
//        ));


        return list;
    }
}
