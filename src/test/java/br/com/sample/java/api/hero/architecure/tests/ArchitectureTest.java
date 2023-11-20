package br.com.sample.java.api.hero.architecure.tests;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchTests;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.GeneralCodingRules;
import com.tngtech.archunit.library.dependencies.SliceRule;
import com.tngtech.archunit.library.dependencies.SlicesRuleDefinition;

import br.com.sample.java.api.hero.architecure.tests.rules.ApplicationRules;
import br.com.sample.java.api.hero.architecure.tests.rules.DomainRules;
import br.com.sample.java.api.hero.architecure.tests.rules.ServiceRules;

@AnalyzeClasses(packages = "br.com.sample.java.api.hero", importOptions = {ImportOption.DoNotIncludeTests.class})
public class ArchitectureTest {

    @ArchTest
    static ArchRule dependency_injection_only_by_constructor =
            GeneralCodingRules.NO_CLASSES_SHOULD_USE_FIELD_INJECTION;

    @ArchTest
    SliceRule dependency_cycle = SlicesRuleDefinition.slices()
            .matching("..(*)")
            .should()
            .beFreeOfCycles();
      

    @ArchTest
    static ArchTests applicationRules = ArchTests.in(ApplicationRules.class);

    @ArchTest
    static ArchTests serviceRules = ArchTests.in(ServiceRules.class);

    @ArchTest
    static ArchTests domainRules = ArchTests.in(DomainRules.class);

}
