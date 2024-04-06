#clearall
scoreboard players enable @a clearall
execute as @a[scores={clearall=1..}] run kill @e[type=!minecraft:player]
execute as @a[scores={clearall=1..}] run kill @e[type=minecraft:item]
execute as @a[scores={clearall=1..}] run title @a times 0.2s 5s 1s
execute as @a[scores={clearall=1..}] run title @a title "ВСЕ ENTITY УБИТЫ!"
scoreboard players set @a clearall 0

#clear
scoreboard players enable @a clear
execute as @a[scores={clear=1..}] run kill @e[type=minecraft:item]
execute as @a[scores={clear=1..}] run kill @e[type=minecraft:arrow]
execute as @a[scores={clear=1..}] run title @a times 0.2s 1s 0.3s
execute as @a[scores={clear=1..}] run title @a title "карта очищена!"
scoreboard players set @a clear 0

#unbreakable
scoreboard players enable @a set_unbreakable
execute as @a[scores={set_unbreakable=1..}] run item modify entity @s weapon.mainhand ppgmod:123
execute as @a[scores={set_unbreakable=1..}] run title @s times 0.2s 1s 0.3s
execute as @a[scores={set_unbreakable=1..}] run title @s title "предмет неломаем"
scoreboard players set @a set_unbreakable 0




