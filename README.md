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

| Argument       | Description                                                                    |
| -------------- | ------------------------------------------------------------------------------ |
| ClientId       | Your OAuth2 client id                                                          |
| ClientSecret   | Your OAuth2 client secret                                                      |
| PathToGaebFile | A path to a local [GAEB file](https://www.dangl-it.com/articles/what-is-gaeb/) |

If you don't have values for `ClientId` and `ClientSecret` yet, you can [check out the documentation](https://docs.dangl-it.com/Projects/AVACloud/latest/howto/registration/developer_signup.html) for instructions on how to register for **AVA**Cloud and create an OAuth2 client.

You can directly use the file `GAEBXML_EN.X86` in this repository if you don't have a GAEB file at hand.

This example app does five operations:

1. The local GAEB file is transformed to Excel and saved next to the input file
2. The local GAEB file is converted to the unified **Dangl.AVA** format and the total price as well as the number of positions in the bill of quantities is printed to the console
3. It prints all positions to the console, in the format: _Item Number - Short Text - Unit Tag - Unit Price_
4. It creates a new `ProjectDto` and uses the _AvaConversion_ConvertToReb_ endpoint to create a new REB DA11 file for quantities in the project root as _CreatedReb.d11_
5. It creates a new `ProjectDto` and uses the _AvaConversion_ConvertToGaeb_ endpoint to create a new GAEB file in the root of the project as _CreatedGaeb.X86_. It's using GAEB XML V3.2 and the X86 exchange phase.
6. Two invoices are created, one in the `XRechnung` format and one in `Factur-X` / `ZUGFeRD`

## AVACloud Key Features

-   Can read all GAEB90, GAEB2000 and GAEB XML files. It includes many heuristics and eror corrections that can recover incorrect files
-   Hassle-free import: Just pass the file to **AVACloud**, format detection and error recovery happens automatically
-   Advanced code, built on years of experience, allows the preservation of most information even when converting to an earlier version of the GAEB standard
-   Automatic calculation of prices, quantities and more - **AVACloud** can do much more beyond just converting your data
-   Over **250.000** tests are run automatically on every commit. Tests range from unit tests in the conversion code up to full integration tests mirroring a full production environment

### Supported Formats

![AVACloud Features](./img/AVACloud%20Diagram%20EN.png)

**... and many more!**

### UI Components

Easy integration with prebuilt UI components is possible within minutes:

-   Either by using our Angular specific `@dangl/angular-ava` package: <https://www.npmjs.com/package/@dangl/angular-ava>
-   Or with our framework agnostict Html web component implementation that run anywhere, either in web apps or locally in a web view: <https://www.npmjs.com/package/@dangl/web-components-ava>

---

[License](./LICENSE.md)
