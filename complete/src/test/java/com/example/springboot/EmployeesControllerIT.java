package com.example.springboot;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeesControllerIT {

	@Autowired
	private TestRestTemplate template;

    @Test
    public void getIndex() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/", String.class);
        assertThat(response.getBody()).isEqualTo("<html>\n" +
                "<head>\n" +
                "  <link rel=\"stylesheet\" href=\"./css/normalize.css\">\n" +
                "  <link rel=\"stylesheet\" href=\"./css/skeleton.css\">\n" +
                "  <script\n" +
                "  src=\"https://code.jquery.com/jquery-3.6.0.js\"\n" +
                "  integrity=\"sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=\"\n" +
                "  crossorigin=\"anonymous\"></script>\n" +
                "</head>\n" +
                "\n" +
                "<style>\n" +
                "  div.card-outline {\n" +
                "    outline-style: solid;\n" +
                "    outline-color: #dcdcdc;\n" +
                "    outline-width: 1px;\n" +
                "    padding: 10px;\n" +
                "  }\n" +
                "</style>\n" +
                "\n" +
                "<body>\n" +
                "  <script>\n" +
                "    $(document).ready(function() {\n" +
                "\n" +
                "      let employeesAPIUrl = 'http://127.0.0.1:8080/api/employees';\n" +
                "\n" +
                "      $.getJSON( employeesAPIUrl, function( data ) {\n" +
                "        let employees = data;\n" +
                "        console.log(employees);\n" +
                "\n" +
                "        let cardCount = 4;\n" +
                "        for(let i = 0; i < cardCount; i++) {\n" +
                "          let cardId = i+1;\n" +
                "          if(employees.length > i) {\n" +
                "            console.log(employees[i]);\n" +
                "            $('#' + cardId + 'Name').val(employees[i]['name'])\n" +
                "            $('#' + cardId + 'Notes').text(employees[i]['notes'])\n" +
                "          }\n" +
                "        }\n" +
                "      });\n" +
                "    });\n" +
                "  </script>\n" +
                "\n" +
                "<!-- .container is main centered wrapper -->\n" +
                "<div class=\"container\">\n" +
                "\n" +
                "  <br/>\n" +
                "\n" +
                "  <!-- columns should be the immediate child of a .row -->\n" +
                "  <div class=\"row\">\n" +
                "    <div class=\"twelve columns\">\n" +
                "      <h1>People Card Deck</h1>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "\n" +
                "  <div class=\"row\">\n" +
                "    <div class=\"six columns card-outline\">\n" +
                "      <h4>1st Card</h4>\n" +
                "      <label for=\"1Name\">Name</label>\n" +
                "      <input class=\"u-full-width\" type=\"text\" placeholder=\"Worker Name\" id=\"1Name\">\n" +
                "      <label for=\"1Notes\">Notes</label>\n" +
                "      <textarea class=\"u-full-width\" placeholder=\"Type notes here...\" id=\"1Notes\"></textarea>\n" +
                "      <!-- <input class=\"button-primary\" type=\"submit\" value=\"Save State\"> -->\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"six columns card-outline\">\n" +
                "      <h4>2nd Card</h4>\n" +
                "      <label for=\"2Name\">Name</label>\n" +
                "      <input class=\"u-full-width\" type=\"text\" placeholder=\"Worker Name\" id=\"2Name\">\n" +
                "      <label for=\"2Notes\">Notes</label>\n" +
                "      <textarea class=\"u-full-width\" placeholder=\"Type notes here...\" id=\"2Notes\"></textarea>\n" +
                "      <!-- <input class=\"button-primary\" type=\"submit\" value=\"Save State\"> -->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "\n" +
                "  <br/>\n" +
                "\n" +
                "  <div class=\"row\">\n" +
                "    <div class=\"six columns card-outline\">\n" +
                "      <h4>3rd Card</h4>\n" +
                "      <label for=\"3Name\">Name</label>\n" +
                "      <input class=\"u-full-width\" type=\"text\" placeholder=\"Worker Name\" id=\"3Name\">\n" +
                "      <label for=\"3Notes\">Notes</label>\n" +
                "      <textarea class=\"u-full-width\" placeholder=\"Type notes here...\" id=\"3Notes\"></textarea>\n" +
                "      <!-- <input class=\"button-primary\" type=\"submit\" value=\"Save State\"> -->\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"six columns card-outline\">\n" +
                "      <h4>4th Card</h4>\n" +
                "      <label for=\"4Name\">Name</label>\n" +
                "      <input class=\"u-full-width\" type=\"text\" placeholder=\"Worker Name\" id=\"4Name\">\n" +
                "      <label for=\"4Notes\">Notes</label>\n" +
                "      <textarea class=\"u-full-width\" placeholder=\"Type notes here...\" id=\"4Notes\"></textarea>\n" +
                "      <!-- <input class=\"button-primary\" type=\"submit\" value=\"Save State\"> -->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "\n" +
                "<!--  <br/>-->\n" +
                "\n" +
                "<!--  <div class=\"row\">-->\n" +
                "<!--    <div class=\"six columns\">-->\n" +
                "<!--      <input class=\"button-primary\" type=\"submit\" value=\"Save to Excel Sheet\">-->\n" +
                "<!--      <input class=\"button-primary\" type=\"submit\" value=\"Save to Database\">-->\n" +
                "<!--    </div>-->\n" +
                "<!--  </div>-->\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "<!-- Note: columns can be nested, but it's not recommended since Skeleton's grid has %-based gutters, meaning a nested grid results in variable with gutters (which can end up being *really* small on certain browser/device sizes) -->\n" +
                "\n" +
                "</body>\n" +
                "</html>");
    }
}
