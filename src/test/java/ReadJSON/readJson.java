package ReadJSON;

import POJo.EmpRecords;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.*;

public class readJson {

  public static void main(String[] args) throws IOException {

      ObjectMapper om = new ObjectMapper();
      List<EmpRecords> eR = om.readValue(new File("src/test/resource/JsonFiles/record.json"), new TypeReference<List<EmpRecords>>() {});

      Optional<EmpRecords> model = Objects.requireNonNull(eR).stream().filter(c -> c.getName().equals("John")).findFirst();
      System.out.println(model.get().getCity());
  }

}
