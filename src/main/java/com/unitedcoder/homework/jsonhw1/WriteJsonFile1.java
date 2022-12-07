package com.unitedcoder.homework.jsonhw1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteJsonFile1 {
    public static void main(String[] args) {
        ProductHW product1=new ProductHW(true,"TeslaModelX","Tesla","TE15",1500.90,
                200,100,1000,50,true);
        ProductHW product2=new ProductHW(true,"Mac","Tesla","TE15",1000,
                200,100,1000,50,true);
        ProductHW product3=new ProductHW(true,"FirStep","Tesla","TE15",100,
                200,100,1000,50,false);
        List<ProductHW> productList=new ArrayList<>();
        productList.addAll(Arrays.asList(product1,product2,product3));
        ObjectMapper mapper=new ObjectMapper();
        Products products=new Products(productList);
        String objectValue=null;
        try {
            objectValue=mapper.writeValueAsString(products);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        try {
            FileUtils.writeStringToFile(new File("jsonfile//multipleProducts-info.json"),objectValue);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
