package decoder

import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json
import protocol.ServerEvent

object KotlinxJsonDecoder : Decoder {
  private val json = Json {
    useArrayPolymorphism = true
  }

  override fun decode(string: String): List<ServerEvent> {
    return json.decodeFromString(ListSerializer(ServerEvent.serializer()), string)
  }
}
