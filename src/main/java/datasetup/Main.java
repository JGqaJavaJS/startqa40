package datasetup;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FillData fillData = new FillData();
        List<DataCommonDTO> list = fillData.fillData();
        System.out.println(list.get(0).getUser().getEmail());
        System.out.println(list.get(0).getCars()[0].getId());
        System.out.println(list.get(0).getCars()[1].getModel());
        System.out.println(list.get(0).getCars()[0].getModel());
    }
}
