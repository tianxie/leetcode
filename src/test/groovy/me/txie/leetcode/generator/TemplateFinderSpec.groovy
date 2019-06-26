package me.txie.leetcode.generator


import spock.lang.Specification

class TemplateFinderSpec extends Specification {

    def "Find templates"() {

        when: "find templates in classpath"
        List<String> templates = TemplateFinder.getTemplates()

        then: "find templates successfully"
        templates.size() == 2

    }
}
