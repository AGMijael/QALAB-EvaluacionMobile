Feature: Evaluacion en swaglab

  @test
  Scenario: Log in exitoso, validar el titulo PRODUCTS y que exista almenos un item

    Given que me enuentro en el login de Swaglab
    When inicio sesión con usuario: "standard_user" y contraseña: "secret_sauce"
    Then muestra el texto "PRODUCTS"
    And validar que haya un elemento