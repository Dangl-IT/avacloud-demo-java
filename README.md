# avacloud-demo-java

[**AVA**Cloud](https://www.dangl-it.com/products/avacloud-gaeb-saas/) is a web based Software as a Service (SaaS) offering for [GAEB files](https://www.dangl-it.com/articles/what-is-gaeb/).  
The GAEB standard is a widely used format to exchange tenderings, bills of quantities and contracts both in the construction industry and in regular commerce. **AVA**Cloud uses the [GAEB & AVA .Net Libraries](https://www.dangl-it.com/products/gaeb-ava-net-library/) and makes them available to virtually all programming frameworks via a web service.

This project here contains example code in Java to read and convert GAEB files. The client code is generated from the [**AVA**Cloud Swagger Specification](https://avacloud-api.dangl-it.com/swagger-internal).

## Step-By-Step Tutorial

[Please find here a step-by-step tutorial how to use the Java client.](https://www.dangl-it.com/articles/create-edit-and-convert-gaeb-files-in-java-with-the-avacloud-api/)

## Build

Execute the following command in the root directory of the project:

    cmd /c mvn package -f "pom.xml"

## Run

Execute the compiled library with the following arguments:

    java -jar target/com.danglit.avacloud.client-1.1.0.jar <ClientId> <ClientSecret> <PathToGaebFile>

Replace the arguments with the following:

| Argument | Description |
|----------|-------------|
| ClientId       | Your OAuth2 client id |
| ClientSecret   | Your OAuth2 client secret |
| PathToGaebFile | A path to a local [GAEB file](https://www.dangl-it.com/articles/what-is-gaeb/) |

If you don't have values for `ClientId` and `ClientSecret` yet, you can [check out the documentation](https://docs.dangl-it.com/Projects/AVACloud/latest/howto/registration/developer_signup.html) for instructions on how to register for **AVA**Cloud and create an OAuth2 client.

You can directly use the file `GAEBXML_EN.X86` in this repository if you don't have a GAEB file at hand.

This example app does four operations:

1. The local GAEB file is transformed to Excel and saved next to the input file
2. The local GAEB file is converted to the unified **Dangl.AVA** format and the total price as well as the number of positions in the bill of quantities is printed to the console
3. It prints all positions to the console, in the format: _Item Number - Short Text - Unit Tag - Unit Price_
4. It creates a new `ProjectDto` and uses the _AvaConversion_ConvertToReb_ endpoint to create a new REB DA11 file for quantities in the project root as _CreatedReb.d11_

---
[License](./LICENSE.md)
